package chess.domain.piece;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

public class KingTest {

  @Test
  @DisplayName("킹을 팀을 넣어서 생성하면 1팀 위치는 e8, 2팀은 e1에 , 표시명은 1팀K, 2팀k로 리턴한다")
  void testKingCreation() {

    //given
    King king1 = new King(Team.BLACK);
    King king2 = new King(Team.WHITE);

    //when // given
    assertThat(king1.getPosition()).isEqualTo("E1");
    assertThat(king1.getDisplayName()).isEqualTo("k");
    assertThat(king2.getPosition()).isEqualTo("E8");
    assertThat(king2.getDisplayName()).isEqualTo("K");
  }

}
