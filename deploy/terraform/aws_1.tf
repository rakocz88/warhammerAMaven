data "aws_ami" "base_ami" {
  owners = ["099720109477"]  # cannonical user id
  most_recent = true

  name_regex = "ubuntu/images/hvm-ssd/ubuntu-bionic-18.04-amd64-server-*"

  filter {
    name   = "virtualization-type"
    values = ["hvm"]
  }
}

provider "aws" {
  region        = "us-east-1"
}

resource "aws_security_group" "security_group" {
  vpc_id = "vpc-2093625d"
  
  ingress {
    description = "http"
    from_port = 80
    to_port = 80
    cidr_blocks = ["0.0.0.0/0"]
    protocol = "tcp"
  }
  ingress {
    description = "ssh"
    from_port = 22
    to_port = 22
    protocol = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
  ingress {
    description = "ping"
    from_port = -1
    to_port = -1
    protocol = "icmp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port = 0
    to_port = 0
    protocol = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  name = "warhammer-sg"

  tags = {
    Name = "warhammer-sg"
  }
}

resource "aws_key_pair" "deployer" {
  key_name    = "deployer_key"
  public_key  = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDl3cSZ3E5283480xN9qVmnSXUXa6axDH36273ZpTjLftwCVxRgz7Pb3MbAwGpr88LEksUrEFBXVM0wGYRPPhfhps9uE6Yc0BQfqOxze8XmVdEOCpG7mNwnryIp9DlZ8uC7AkYqsjCX99X3eWZBNtRBcFoJHmm2YeJWGRN6ft8STMeMuhCcz7izCom0meEInI2Gz04LARDl1v1ZFEsy83TQO1FUimKZFsr5QX6ZxjmuZDJvOtPoHYyBIkrHs37TmdLIVVFCYXhC2DbmZYkIqUPlCt1Wqaq/sxpG8xDOLIq9wDjNZEuQ5A/YAzmT7bpWtn6S70OZK+fj0R/TxsrcfAvzWxoVEa1keSTbA72KUqFE+6BoFQm33TpfQTbMNO/n3Ftn8YTlBoVcPgNN57PUWixZFAxbUrgt4dOQsSuqcQgmOA03bN6bX5d5JQgbfcL5etSXPp6x6fVTuPu0HBoTOSttwuv1fPI+9YL8+/zixaD7MtAmUiCzc8fAVDruIi8fkkU= root@fradziejewski"
}

resource "aws_instance" "aws_warhammer" {
  ami           = data.aws_ami.base_ami.id
  instance_type = "t2.micro"
  key_name      =  "deployer_key"
  vpc_security_group_ids = [
    "warhammer-sg"
  ]
  connection {
    host = aws_instance.aws_warhammer.public_dns
    private_key = file("~/.ssh/id_rsa")
    user = "ubuntu"
  }
  provisioner "remote-exec"{
    inline = ["sudo apt-get update -y && sudo apt-get install -yqq python3"]
  }
}
output "instance_public_dns" {
  value = aws_instance.aws_warhammer.public_dns
}
