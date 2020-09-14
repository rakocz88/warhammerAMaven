pub_dns=$(terraform output | awk '{print $3}')
sed "s/ADDR_IP/$pub_dns/g" ./../ansible/inventories/aws_inv/aws > ./../ansible/inventories/aws_inv/aws_deploy
echo $pub_dns
