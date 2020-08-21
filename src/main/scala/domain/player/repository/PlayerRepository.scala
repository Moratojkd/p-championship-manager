package domain.player.repository

import domain.player.Player

trait PlayerRepository {

  def save(player: Player): String

}
