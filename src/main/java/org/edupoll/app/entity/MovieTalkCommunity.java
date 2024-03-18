package org.edupoll.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieTalkCommunity {
	@Id
	private Long id;
	
	private String title;
	private String user;
	private LocalDate wirtedAt;
	private Long viewCount;
	
	

}
