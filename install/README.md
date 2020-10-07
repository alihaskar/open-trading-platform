

# Specific to microk8s
snap install microk8s --classic

microk8s enable dns storage helm3 registry

microk8s start

alias kubectl=microk8s.kubectl
alias helm=microk8s.helm3

# K8s generic cmds  (works with kubeadm cluster/minikube)

kubectl create ns kafka

helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator

helm install kafka-opentp --namespace kafka incubator/kafka

isntall test client:

kubectl apply -f kafka_cmdline_client.yaml


kubectl exec -it --namespace=kafka cmdlineclient -- /bin/bash 
kafka-topics --zookeeper kafka-opentp-zookeeper:2181 --topic orders --create --partitions 1 --replication-factor 1



Postgres:

kubectl create ns postgresql

helm install opentp --namespace postgresql bitnami/postgresql --set-file pgHbaConfiguration=./pb_hba_no_sec.conf


export POSTGRES_PASSWORD=$(kubectl get secret --namespace postgresql opentp-postgresql -o jsonpath="{.data.postgresql-password}" | base64 --decode)

kubectl run opentp-postgresql-client --rm --tty -i --restart='Never' --namespace postgresql --image ettec/opentp-dbclient:latest --env="PGPASSWORD=$POSTGRES_PASSWORD" --command -- psql --host opentp-postgresql -U postgres -d postgres -p 5432 -a -f ./opentp.db

Envoy:

kubectl create ns envoy

helm install opentp-envoy --namespace=envoy stable/envoy -f envoy-config-helm-values.yaml 

Opentp app:

helm install otp-v1 ../otpchart







