package one.digitalinnovation.beerstock.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstock.enums.BeerType;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    public BeerDTO(Long id2, String name2, String brand2, int max2, int quantity2, BeerType type2) {
	}

	private Long id;

    @NotNull
    @Size(min = 1, max = 200)
    private String name;

    @NotNull
    @Size(min = 1, max = 200)
    private String brand;

    @NotNull
    @Max(500)
    private Integer max;

    @NotNull
    @Max(100)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @NotNull
    private BeerType type;

	public int getQuantity() {
		return 0;
	}

	public void setQuantity(int i) {
	}

	public String getName() {
		return null;
	}

	public Object getBrand() {
		return null;
	}

	public Object getType() {
		return null;
	}

    public Object toBeerDTO() {
		return null;
	}

	public Long getId() {
		return null;
	}

	public void setBrand(Object object) {
	}
}
