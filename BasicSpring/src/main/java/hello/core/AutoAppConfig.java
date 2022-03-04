package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // basePackages = { "hello.core.member" }, // default -> 이 클래스의 상단에 있는 package 부터 시작
        // basePackageClasses = { AutoAppConfig.class },
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Configuration.class
        )
)
public class AutoAppConfig {

//        @Bean(name = "memoryMemberRepository")
//        MemberRepository memberRepository() {
//                return new MemoryMemberRepository();
//        }
}
