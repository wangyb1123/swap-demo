# swap-demo


### build and publish docker by using Dockerfile, start swap-gui
docker build -t elbruscloud/swap-gui:0.0.1-SNAPSHOT .
docker push elbruscloud/swap-gui:0.0.1-SNAPSHOT
docker run -d -p 80:80 elbruscloud/swap-gui:0.0.1-SNAPSHOT

### build and publish docker by using jib
gradle jib

### build/push/start swap-angular docker
docker build -t elbruscloud/swap-angular:0.0.1-SNAPSHOT .
docker push elbruscloud/swap-angular:0.0.1-SNAPSHOT
docker run -d -p 80:80 elbruscloud/swap-angular:0.0.1-SNAPSHOT
curl http://localhost

### start swap-service
docker run -d -p 8080:8080 elbruscloud/swap-service:0.0.1-SNAPSHOT
curl http://localhost:8080/stocks

### start swap-core
docker run elbruscloud/swap-core:0.0.1-SNAPSHOT Alex
docker run -e JAVA_TOOL_OPTIONS="-Xms512M -Xmx512M" elbruscloud/swap-core:0.0.1-SNAPSHOT Alex




### update image
docker pull elbruscloud/swap-service:0.0.1-SNAPSHOT
docker pull elbruscloud/swap-gui:0.0.1-SNAPSHOT
docker pull elbruscloud/swap-angular:0.0.1-SNAPSHOT

### other docker command
docker ps
docker stop
docker image ls
docker image inspect elbruscloud/swap-service:0.0.1-SNAPSHOT
docker run -it busybox sh

### login to container
docker exec -it <container> sh
docker exec -it <container> /bin/bash



