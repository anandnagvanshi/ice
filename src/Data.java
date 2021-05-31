package com.primary.connect.response;


import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Data {
private List<Shipment> shipments;
}
