package com.zhouyu.service;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.annotation.Aspect;
import org.omg.CORBA.TIMEOUT;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.swing.plaf.PanelUI;
import java.sql.JDBCType;
import java.util.Map;


@Component
public  class UserService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserService userService;

	/**传播机制
	 * spring事务管理器，创建数据库连接conn
	 * conn.outcommit=false
	 * conn.隔离级别
	 * conn放入ThreadLocal<Map>  key:DataSource  value:conn连接
	 * target.test() sql  sql1,sql2,
	 *	 执行a()重新开启一个事务
	 *	 	挂起------->挂起对象，conn连接---->移除ThreadLocal<Map>
	 *		spring事务管理器，创建数据库连接conn1
	 *		conn1.outcommit=false
	 *		conn1.隔离级别
	 *		conn1放入ThreadLocal<Map>  key:DataSource  value:conn1连接
	 *		sql
	 *		conn1.提交
	 *		恢复--->挂起对象.conn连接----->重新放入ThreadLocal<Map>
	 *		 rollback()----true-------ThreadLocal true:transactionManager.setGlobalRollbackOnParticipationFailure(false);//true:部分失败，全局回滚，false:部分失败，全局不会滚
	 *sql3
	 *提交、----commit----ThreadLocal回滚
	 */
//	RuleBasedTransactionAttribute
	@Transactional(timeout = 1)
	public void test(){
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println(currentTransactionName);

/*		userService.deleteAllT1();
		jdbcTemplate.execute("insert into t1 values(1,1,1,1,1)");*/
		userService.a();
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void a(){
//		jdbcTemplate.execute("insert into t1 values(2,2,2,2,2)");
//		throw new NullPointerException();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println(currentTransactionName);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void deleteAllT1(){
		jdbcTemplate.execute("delete FROM t1;");
	}


}

