package model.order;

import model.product.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * 주문 정보를 나타내는 클래스
 *
 * 구현 방법:
 * 1. 멤버 변수(주문ID, 사용자ID, 주문 항목 목록, 주문일시, 총액, 상태) 선언
 *    - 주문 항목 목록은 ArrayList<OrderItem>으로 구현
 * 2. 생성자 구현 (현재 시간으로 주문일시 초기화)
 * 3. 주문 상태 Enum 내부 정의 (PENDING, PAID, SHIPPED, DELIVERED, CANCELLED)
 * 4. 주문 항목 추가 메서드 구현
 * 5. 총액 계산 메서드 구현
 * 6. 주문 상태 변경 메서드 구현
 * 7. 주문 취소 메서드 구현
 * 8. 영수증 생성 메서드 구현
 * 9. toString() 메서드 오버라이딩: 주문 정보 출력
 */
public class Order {
    private String orderId;
    private String userId;
    private ArrayList<OrderItem> orderItems;
    private LocalDateTime orderTime;
    private int totalPrice;
    private String orderStat;


    //    2. 생성자 구현 (현재 시간으로 주문일시 초기화)
    public Order(String orderId, String userId, ArrayList<OrderItem> orderItems, int totalPrice, String orderStat) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderItems = new ArrayList<>();
        this.orderTime = LocalDateTime.now();
        this.totalPrice = totalPrice;
        this.orderStat = orderStats.PENDING.toString();
    }

//    4. 주문 항목 추가 메서드 구현
    public void addOredrItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

//    5. 총액 계산 메서드 구현
    public void updateTotalPrice(){
        totalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            totalPrice += orderItem.calculateTotalPrice();
        }
    }

//    6. 주문 상태 변경 메서드 구현

    //    3. 주문 상태 Enum 내부 정의 (PENDING, PAID, SHIPPED, DELIVERED, CANCELLED)
    private enum orderStats {
        PENDING, PAID, SHIPPED, DELIVERED, CANCELLED;




    }
}
