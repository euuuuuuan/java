package com.ohgiraffers.practice01.stream.product;

import com.ohgiraffers.practice01.product.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class App {


    public static void main(String[] args) {
        List<Product> list = List.of(
                new Product("아이폰X", "apple", "전자기기류", 1000000),
                new Product("맥프로", "apple", "전자기기류", 6300000),
                new Product("베지밀", "정식품", "음료류", 1000000),
                new Product("파스타면", "de cecco", "식품류", 10000),
                new Product("LG G7", "LG", "전자기기", 700000),
                new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
                new Product("고양이", "베르나르베르베르", "도서", 15000),
                new Product("간다, 봐라", "법정스님", "도서", 8900),
                new Product("까페라떼", "디초코", "음료류", 4000),
                new Product("아포가토", "디초코", "디저트류", 4500)
        );
        // 문제별 메소드를 만들어서 작성하세요.

        // 1. 전자기기류만 모두 출력하세요.
        System.out.println("1. 전자기기류만 모두 출력하세요.");
        System.out.println();
        list.stream()
                .filter(product -> product.getCategory().equals("전자기기류"))
                .forEach(System.out::println);

        System.out.println();

        // 2. apple사가 전제품 10% 할인한다고 할때, 해당제품명과 할인된 가격을 출력하세요.
        System.out.println("2. apple사가 전제품 10% 할인한다고 할때, 해당제품명과 할인된 가격을 출력하세요.");
        System.out.println();
        list.stream()
                .filter(product -> product.getBrand().equals("apple")) // boolean으로 하기 intermediate의 filter
                .map(product -> {
                    int getPrice = product.getPrice(0.1);
                    return product.getProductName() + "의 할인된 가격: " + getPrice + "원";
                })
                .forEach(System.out::println);

        System.out.println();
        // 3. 디초코 상표명이 "dechocolatecoffee"로 변경되었다.
        //	        스트림상에서 디초코 상품들의 상표명을 "dechocolatecoffee"로 변경하고 출력하세요.
        System.out.println("3. 디초코 상표명이 \"dechocolatecoffee\"로 변경되었다.\n" +
                "\t스트림상에서 디초코 상품들의 상표명을 \"dechocolatecoffee\"로 변경하고 출력하세요.");
        System.out.println();
        list.stream()
                .filter(product -> product.getBrand().equals("디초코"))
                .map(product -> {
                    product.setBrand("dechocolatecoffee");
                    return product;
                })
                .forEach(System.out::println);

        // 스트림을 사용하여 디초코 상품들을 필터링합니다.
        // 각 상품의 상표명을 "dechocolatecoffee"로 변경합니다.
        // 변경된 상표명을 출력합니다.

        // 4. 금액이 십만원 이상인 상품을 따로 list로 생성하고 출력하세요.



    }
}
