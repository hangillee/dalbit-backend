package gdsc.skhu.dalbit.domain.DTO.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDate;
@Getter
public class MemoRequestDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    LocalDate date;
    Long memberId;
    String message;
    int spentMoney;
}
