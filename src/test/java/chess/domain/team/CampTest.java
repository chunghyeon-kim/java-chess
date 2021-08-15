package chess.domain.team;

import chess.domain.piece.King;
import chess.domain.piece.Team;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CampTest {
    @Test
    @DisplayName("team 별 기물 세트를 만든다")
    void createPieceSetTest() {
        //given
        Camp blackTeam = new Camp(Team.BLACK);
        Camp whiteTeam = new Camp(Team.WHITE);

        //when

        //then
        assertThat(blackTeam.getPieces())
                .hasSize(16);
               // .contains(new King());
        assertThat(whiteTeam.getPieces()).hasSize(16);
    }

}