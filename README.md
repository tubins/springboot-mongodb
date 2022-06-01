# springboot-mongodb

Test project with Springboot, Springboot-MongoDB, MongoDB ReplicaSet in Docker etc

###
Run the following command to set a replica set.
1. `docker network create mongo-cluster`
2. `docker run --name mongo1 -d --net mongo-cluster -p 9042:9042 mongo:4.4.4 mongod --replSet docker-rs --port 9042` 
3. `docker run --name mongo2 -d --net mongo-cluster -p 9142:9142 mongo:4.4.4 mongod --replSet docker-rs --port 9142`
4. `docker run --name mongo3 -d --net mongo-cluster -p 9242:9242 mongo:4.4.4 mongod --replSet docker-rs --port 9242`
5. `docker exec -it mongo1 mongo --port 9042`
6. `config = {"_id" : "docker-rs", "members" : [{"_id" : 0,"host" : "mongo1:9042"},{"_id" : 1,"host" : "mongo2:9142"},
    {"_id" : 2,"host" : "mongo3:9242"}]}
   rs.initiate(config)`
7. `rs.status()`
8. `use admin`
9. `db.createUser({user: "admin",pwd: "admin",roles: [ { role: "root", db: "admin" }, "root" ]})`
10. Exit from docker container and Set hosts in your machine. `/etc/hosts =>127.0.0.1  localhost mongo1 mongo2 mongo3`
