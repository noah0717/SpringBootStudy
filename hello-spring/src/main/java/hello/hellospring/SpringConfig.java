package hello.hellospring;
import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

   // private EntityManager em;
    //@Autowired
    //public SpringConfig(EntityManager em) {
     //   this.em = em;
    //}

    private final MemberRepository memberRepository;

    @Autowired //생성자가 하나일 때 생략 가능
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

   // @Bean
    //public TimeTraceAop timeTraceAop() {
     //   return new TimeTraceAop();
    //}
   // @Bean
    //public MemberRepository memberRepository() {
     //   return new JpaMemberRepository(em);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JdbcMemberRepository(dataSource);
   // }
}
