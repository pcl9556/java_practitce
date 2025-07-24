package com.projectnull.practice;

public class java_static {

    public class Counter {
        static int count = 0; // 모든 객체가 공유

        public Counter() {
            count++;
            System.out.println("현재 카운트: " + count);
            }
        }

        public class Main {
            public void main(String[] args) {
                new Counter(); // 출력: 현재 카운트: 1
                new Counter(); // 출력: 현재 카운트: 2
                new Counter(); // 출력: 현재 카운트: 3
            }
        }

    }

