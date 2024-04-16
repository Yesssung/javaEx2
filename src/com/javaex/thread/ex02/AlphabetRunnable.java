package com.javaex.thread.ex02;

// Runable 구현 방식 쓰레드
// run 메서드를 오버라이드 한 실행 클래스를 Thread 클래스에 전달

public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		// Thread 내부에서 실행될 로직
		// 주의: 직접 호출하지 않고 .start 메서드를 통한 우회호출
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.printf("%s: %c%n", Thread.currentThread().getName(), ch);
			
			// 잠시 대기
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " 종료");
	}
	
	
	

}
