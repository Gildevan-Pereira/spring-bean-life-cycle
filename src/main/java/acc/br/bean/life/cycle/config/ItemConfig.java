package acc.br.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;

@Configuration
class ItemConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Item item() {
        Item item = new Item();
        return item;
    }

    @Bean
    public String name() {
        return new Item().getName();
    }

    @Bean(name = "itemMagicBeanPostProcessor")
    public MagicBeanPostProcessor magicBeanPostProcessor() {
        return new MagicBeanPostProcessor();
    }
}
