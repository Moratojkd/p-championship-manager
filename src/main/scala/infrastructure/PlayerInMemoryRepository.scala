package infrastructure

import domain.player.Player
import domain.player.repository.PlayerRepository

import scala.collection.immutable.HashMap

class PlayerInMemoryRepository extends PlayerRepository {

  private var inMemoryStorage = new HashMap[String, Player]

  override def save(player: Player): String = {
    inMemoryStorage = inMemoryStorage + (player.email -> player)
    player.email
  }
}
