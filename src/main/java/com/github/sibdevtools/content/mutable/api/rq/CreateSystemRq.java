package com.github.sibdevtools.content.mutable.api.rq;

import lombok.Builder;

/**
 * Create system in content service request dto
 *
 * @param systemCode system code
 */
@Builder
public record CreateSystemRq(String systemCode) {

}
