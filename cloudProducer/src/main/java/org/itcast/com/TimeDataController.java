package org.itcast.com;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeDataController {


	private  static long startDate = 0L; 
	
	private  static long endDate = 0L; 
	
	@Pointcut("@annotation(org.itcast.com.TimeRun)")
	public void annotationPointcut(){
		
	}
	 
	@Before(value = "annotationPointcut()")
	public  void testBefore(JoinPoint point){
		//获取开始时间
		startDate = new Date().getTime();
		Signature signature = point.getSignature();
		MethodSignature methodSignature = (org.aspectj.lang.reflect.MethodSignature) signature;
		Method method = methodSignature.getMethod();
		System.out.println("classname:"+method.getDeclaringClass().getName());
		System.out.println("target:"+point.getTarget().getClass().getName());  //ProducerService
		System.out.println("method:"+method.getName());//getProducer
		System.out.println("开始时间========"+startDate + "===="+Thread.currentThread().getName());
		//获取结束时间
	}
	
	@AfterThrowing(value = "annotationPointcut()")
	public  void testAfter(JoinPoint point, Throwable e) throws Throwable{
			//获取开始时间
			endDate = new Date().getTime();
			Signature signature = point.getSignature();
			MethodSignature methodSignature = (org.aspectj.lang.reflect.MethodSignature) signature;
			Method method = methodSignature.getMethod();
			String className = method.getDeclaringClass().getName();
			String methodName = method.getName();
			System.out.println("classname:"+className);
			System.out.println("target:"+point.getTarget().getClass().getName());
			System.out.println("method:"+methodName);
			System.out.println("结束时间==================="+"===="+endDate + Thread.currentThread().getName());
			System.out.println("开始时间==================="+ "===="+startDate + Thread.currentThread().getName());
		
			String params = "";
//			if(point.getArgs() != null && point.getArgs().length > 0){
//				for (int i = 0; i < point.getArgs().length; i++) {
//					//params += JSONUtil.toJSON(point.getArgs()[i]) + ";";
//				}
//			} 
			 System.out.println("方法描述:" + getServiceMthodDescription(point));  
	         System.out.println("请求参数:" + params);  
	}
	
	 public  static String getServiceMthodDescription(JoinPoint joinPoint)  
             throws Exception {  
        String targetName = joinPoint.getTarget().getClass().getName();  
        String methodName = joinPoint.getSignature().getName();  
        Object[] arguments = joinPoint.getArgs();  
        Class targetClass = Class.forName(targetName);  
        Method[] methods = targetClass.getMethods();  
        String description = "";  
         for (Method method : methods) {  
             if (method.getName().equals(methodName)) {  
                Class[] clazzs = method.getParameterTypes();  
                 if (clazzs.length == arguments.length) {  
                    description = method.getAnnotation(TimeRun. class).description();  
                     break;  
                }  
            }  
        }  
         return description;  
    }  
}
