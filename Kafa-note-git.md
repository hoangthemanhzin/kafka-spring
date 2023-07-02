### Tao mot topic trong kafka : 

```
bin/kafka-topics.sh --create --topic kafka-template --bootstrap-server localhost:9092
```

==> O day tao mot kafka topic co ten la kafka-template.

======================================================================================

### Viet mot so event de dua vao kafka : 

```
bin/kafka-console-producer.sh --topic kafka-template --bootstrap-server localhost:9092
```

==> Sau do co the viet them mot so event tu cau lenh ma ta vua tao. 
- event 1 
- event 2 

=======================================================================================

### Doc cac event tu kafka ra : 

```
bin/kafka-console-consumer.sh --topic kafka-template --from-beginning --bootstrap-server localhost:9092
```
![Screenshot from 2023-07-03 00-46-49](https://github.com/hoangthemanhzin/kafka-spring/assets/77549345/8db02636-4b5e-49a6-a749-5c514f90a421)


### Note mot so y tuong : 
--from-beginning: Đây là một tùy chọn để bắt đầu đọc dữ liệu từ đầu của topic. 
Nếu bạn không sử dụng tùy chọn này, Kafka Console Consumer sẽ chỉ đọc các tin nhắn mới nhất.

