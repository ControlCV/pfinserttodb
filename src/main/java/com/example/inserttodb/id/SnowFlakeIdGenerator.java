package com.example.inserttodb.id;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * 分布式snowflake Id生成器
 * @author scotthu
 *
 */
@Component("IdGeneratorImpl")
public class SnowFlakeIdGenerator implements IdGenerator{
	
	private Sequence sequence;
	
	
	@PostConstruct
	public void init() {
		Long workerId = 0L;
		
		Long dataCenterId = workerId/32;
		Long realWorkerId = workerId%32;
		sequence = new Sequence(realWorkerId,dataCenterId);
	}
	
	@Override
	public Long generate() {
		return sequence.nextId();
	}

	@Override
	public String generateStr() {
		if(this.sequence == null) {
            this.init();
        }
		return String.valueOf(sequence.nextId());
	}

}
