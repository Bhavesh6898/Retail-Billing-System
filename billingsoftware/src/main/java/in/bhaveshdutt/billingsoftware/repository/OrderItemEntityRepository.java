package in.bhaveshdutt.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhaveshdutt.billingsoftware.entity.OrderItemEntity;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {

    

}
