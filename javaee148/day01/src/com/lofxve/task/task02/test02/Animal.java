package com.lofxve.task.task02.test02;

/**
 * @ClassName Animal
 * @Author 魏振东
 * @Date 2020/12/12 19:23
 */
public class Animal {
//    编号、房间号、体重、年龄、父亲id、母亲id、品种
    private String id;
    private String roomNumber;
    private String bodyWeight;
    private String age;
    private String fatherId;
    private String motherId;
    private String variety;

    public Animal() {
    }

    public Animal(String id, String roomNumber, String bodyWeight, String age, String fatherId, String motherId, String variety) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.bodyWeight = bodyWeight;
        this.age = age;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.variety = variety;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(String bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    public String getMotherId() {
        return motherId;
    }

    public void setMotherId(String motherId) {
        this.motherId = motherId;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", bodyWeight='" + bodyWeight + '\'' +
                ", age='" + age + '\'' +
                ", fatherId='" + fatherId + '\'' +
                ", motherId='" + motherId + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
    public void move() {
        System.out.println("动");
    }
}