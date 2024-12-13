package acc.br.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;

@Configuration
public class MagicPostProcessorConfig {
   
	@Bean
    public MagicBeanPostProcessor magicBeanPostProcessor() {
        return new MagicBeanPostProcessor();
    }
}
