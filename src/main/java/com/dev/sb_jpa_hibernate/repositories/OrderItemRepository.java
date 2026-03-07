package com.dev.sb_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sb_jpa_hibernate.entities.OrderItem;
import com.dev.sb_jpa_hibernate.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
