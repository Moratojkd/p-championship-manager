package application.service

import domain.player.Player
import domain.player.repository.PlayerRepository

class PlayerCreationService(
  repository: PlayerRepository
  // emailValidator: String => Boolean
) {

  def createPlayer(player: Player) =
    //validate mail on application layer or infrastructure layer ?
    repository.save(player)

}
