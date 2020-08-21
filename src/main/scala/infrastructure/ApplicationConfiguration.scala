package infrastructure

import application.service.PlayerCreationService
import domain.player.repository.PlayerRepository
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
class ApplicationConfiguration {

  @Bean
  def playerCreationService(repository: PlayerRepository) =
    new PlayerCreationService(repository)

}
