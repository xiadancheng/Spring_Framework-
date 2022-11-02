package com.zhouyu.editor;

import com.zhouyu.service.User;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;

import java.util.Collections;
import java.util.Set;

public class StringToUserConverter implements ConditionalGenericConverter {
	//匹配条件
	@Override
	public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.getType().equals(String.class)&&targetType.getType().equals(User.class);
	}

	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		return Collections.singleton(new ConvertiblePair(String.class,User.class));
	}

	//转化逻辑
	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		User user = new User();
		user.setName((String) source);
		return user;
	}
}
