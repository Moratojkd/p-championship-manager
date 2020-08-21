package infrastructure

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import domain.player.Player

@JsonNaming(value = classOf[PropertyNamingStrategy.SnakeCaseStrategy])
case class PlayerRequestDto(name: String, surname: String, email: String)

object PlayerRequestDto {
  def toModel(playerRequestDto: PlayerRequestDto): Player = {
    Player(
      name = playerRequestDto.name,
      surname = playerRequestDto.surname,
      email = playerRequestDto.email
    )
  }
}
