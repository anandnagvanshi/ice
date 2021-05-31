package com.primary.connect.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
public class Shipment {
@NonNull
private String shipmentTrackingNumber;
private String displayStatus;
private String destinationAddress;
private String originAddress;
private String weight;
private String volume;
private String pieces;
private String pickupFrom;
private String pickupTo;
private String deliveryFrom;
private String deliveryTo;
private String commodity;
private String shipmentId;
private String shipmentNumber;
private String createdBy;
private String updated;
}
