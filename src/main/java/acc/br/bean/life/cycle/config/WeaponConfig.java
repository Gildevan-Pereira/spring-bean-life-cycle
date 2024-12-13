package acc.br.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.beans.Weapon;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;

@Configuration
class WeaponConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Weapon weapon() {
    	Weapon weapon = new Weapon();
        return weapon;
    }

    @Bean
    public String name() {
        return new Item().getName();
    }

    @Bean(name = "weaponMagicBeanPostProcessor")
    public MagicBeanPostProcessor magicBeanPostProcessor() {
        return new MagicBeanPostProcessor();
    }
}
