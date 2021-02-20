package as.sfgdi.config;

import as.sfgdi.examplebeans.FakeDataSource;
import as.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${as.username}")
    String user;

    @Value("${as.password}")
    String password;

    @Value("${as.dburl}")
    String url;

    @Value("${as.jms.username}")
    String jmsUsername;

    @Value("${as.jms.password}")
    String jmsPassword;

    @Value("${as.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }
}
