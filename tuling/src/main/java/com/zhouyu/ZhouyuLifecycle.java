package com.zhouyu;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * 监听spring容器
 */
//@Component
public class ZhouyuLifecycle implements SmartLifecycle {
	private boolean isRunning=false;

	@Override
	public void start() {
		System.out.println("spring启动0");
		isRunning=true;
	}

	@Override
	public void stop() {
		System.out.println("spring容器停止0");

	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}

	@Override
	public int getPhase() {
		return 1;
	}
}
