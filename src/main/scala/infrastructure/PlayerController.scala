package infrastructure

import application.service.PlayerCreationService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.{
  GetMapping,
  PostMapping,
  RequestBody,
  RequestMapping,
  ResponseStatus,
  RestController
}

@RestController
@RequestMapping(Array("/api/player"))
class PlayerController(playerCreationService: PlayerCreationService) {

  //Just with testing proposal.
  @GetMapping(Array("/holamundo"))
  def testHelloWorld: String = "hola mundo =)"
//todo add logs, maybe validate in this point
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  def createPlayer(@RequestBody playerRequestDto: PlayerRequestDto): String = {
    playerCreationService.createPlayer(
      PlayerRequestDto.toModel(playerRequestDto)
    )
  }

}
