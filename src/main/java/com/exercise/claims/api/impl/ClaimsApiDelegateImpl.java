package com.exercise.claims.api.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.exercise.claims.api.ClaimsApiDelegate;
import com.exercise.claims.model.Claims;
import com.exercise.claims.model.Claim;
import com.exercise.claims.model.ClaimEntity;
import com.exercise.claims.service.ClaimService;


public class ClaimsApiDelegateImpl implements ClaimsApiDelegate {

	@Autowired
	ClaimService claimService;

	
	@Override
	public ResponseEntity<Claim> addClaim(Claim body) {
		ClaimEntity claimEntity = convertFrom(body);
		claimEntity = claimService.addClaim(claimEntity);
		Claim claim = convertFrom(claimEntity);
		return new ResponseEntity<>(claim, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Claims> getAllClaims() {
		List<ClaimEntity> listClaimEntity = claimService.getAllClaims();
		Claims claims = new Claims();
		for (ClaimEntity ce : listClaimEntity) {
			Claim claim = convertFrom(ce);
			claims.addDataItem(claim);
		}
		return new ResponseEntity<>(claims, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Claim> getClaimById(Integer claimId) {
		ClaimEntity ce = claimService.findByClaimId(claimId);
		Claim claim = convertFrom(ce);
		return new ResponseEntity<>(claim, HttpStatus.OK);
	}
	
	private ClaimEntity convertFrom(Claim claim) {
		ClaimEntity claimEntity = new ClaimEntity();
		claimEntity.setClaimId(claim.getClaimId());
		claimEntity.setApplicationDate(claim.getApplicationDate());
		claimEntity.setPolicyNo(claim.getPolicyNo());
		return claimEntity;
	}

	private Claim convertFrom(ClaimEntity claimEntity) {
		Claim claim = new Claim();
		claim.setClaimId(claimEntity.getClaimId());
		claim.setApplicationDate(claimEntity.getApplicationDate());
		claim.setPolicyNo(claimEntity.getPolicyNo());
		return claim;
	}
}


