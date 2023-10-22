package com.nine;

public class Demo {
		public static void perform(Game g) {
			g.play();
		}
		public static void main(String[] args) {
			perform(new Cricket());
			perform(new FootBall());
			perform(new Tennis());

		}
}
