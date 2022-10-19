package com.zhouyu;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 */
@Component
@Lazy
public class ZhouyuApplicationListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		PayloadApplicationEvent event1 = (PayloadApplicationEvent) event;
		System.out.println(event1.getPayload());
	}
}
