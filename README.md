# Spring-Kafka-Docker
SpringBoot + Kafka + Docker 기반의 프로젝트</br>

SpringBoot에서 Kafka의 특정 Topic에 메시지를 생산하고, 해당 Topic을 Listener를 통해 Listen합니다.</br>
Kafka 서버에 해당 메시지가 전달되고, SpringBoot에서 이를 소비할 준비가 되면 메시지를 Pull하는 간단한 예제 프로젝트

## Kafka 설치
```
cd docker
docker-compose up -d
``` 

## Container 확인
```
docker ps
```

## Container 실행
```
docker exec -it kafka bash
```

## Kafka 컨테이너의 Topic 메시지 확인
```
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test
```