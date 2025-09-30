package in.vishalproj.moneymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishalproj.moneymanager.entity.ProfileEntity;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity,Long> {

    //select * from tbl_profile where email = ?
    Optional<ProfileEntity> findByEmail(String email);

    Optional<ProfileEntity> findByActivationToken(String activationToken);

}
