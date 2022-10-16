package com.zhouyu;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 条件匹配，判断下面条件是否满足，满足就创建Bean
 */
public class ZhouyuCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		try {
			context.getClassLoader().loadClass("com.zhouyu.service.User");
			return true;
		} catch (ClassNotFoundException e) {

			return false;
		}
	}
}

