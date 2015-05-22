package com.scxh.java.ex027.thread.product_consumer;

import java.util.Random;
/**
 * 随机生成10个不同随机数
 * @author viktor
 *
 */
public class RandomNumber {
	Random random = new Random();

	int b[] = new int[10];

	int[] ranNumber() {
		int n = 0;
		while (n < 10) {
			b[n] = random.nextInt(10);

			if (n >= 1) {
				int i = 0;
				while (i < n) {
					if (b[i] == b[n])
						break;// 如果相同，外层循环再执行一次，此时n的值不变
					i++;
				}
				if (i == n)
					n++;
			} else{
				n++;
			}
		}
		return b;
	}
}
