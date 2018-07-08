package com.speldipn.example.fc_java.DesignTools;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 애너테이션 설계
// 1. Target - 적용할 대상 (생성자, 변수, 함수, 패키지, 클래스)
// 2. Retention - 정보의 유지단계 (소스코드, 컴파일, 실행시간)
// 3. Documented - 문서화 되야 하는 애너테이션일 경우 사용
// 4. Inherited - 자동으로 상속받는 애너테이션 타입일 경우

@Target(ElementType.TYPE) // TYPE = 클래스
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
	public String val() default "어떤값";
	public String key();

}
