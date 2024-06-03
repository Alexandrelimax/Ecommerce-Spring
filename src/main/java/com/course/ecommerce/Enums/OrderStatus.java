package com.course.ecommerce.Enums;


public enum OrderStatus {
    WAITING_PAIMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final Integer code;

    private OrderStatus(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }

    public static OrderStatus valueOf(Integer code){
        for(OrderStatus valueCode: OrderStatus.values()){
            if(valueCode.getCode().equals(code)){
                return valueCode;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

}
