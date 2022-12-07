package com.example.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BlogmarcoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogmarcoApplication.class, args);
		// System.out.println(new BCryptPasswordEncoder().encode("321"));
	}

}

// insert into tb_user
// values('1','$2a$10$fMuJwJnb/ch1Pav.oBARdu0haGgMuN.KtZbP19yqM7MtgdYuH2Kya','admin');
// /* senha 321*/
// insert into tb_user
// values('0','$2a$10$fMuJwJnb/ch1Pav.oBARdu0haGgMuN.KtZbP19yqM7MtgdYuH2Kya','user');
// /* senha 321*/

// insert into tb_role values('10','ROLE_ADMIN' );
// insert into tb_role values('11','ROLE_USER' );

// insert into tb_users_roles values('1', '10'); /* add user como admin*/
// insert into tb_users_roles values('0', '11'); /* add admin como user*/
