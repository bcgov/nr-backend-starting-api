package ca.bc.gov.backendstartapi.vault;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VaultRequest {

  private String path;
  private String vaultName;
  private String token;

}
