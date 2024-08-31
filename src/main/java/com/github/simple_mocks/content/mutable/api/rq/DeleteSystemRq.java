package com.github.simple_mocks.content.mutable.api.rq;

import lombok.Builder;

/**
 * Delete system code in content service request dto
 *
 * @param systemCode system groupCode
 */
@Builder
public record DeleteSystemRq(String systemCode) {

}
