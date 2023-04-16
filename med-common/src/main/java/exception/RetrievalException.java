package exception;

import lombok.Getter;

/**
 * @author chen
 * @date 2023.04.02 11:47
 */
@Getter
public class RetrievalException extends RuntimeException{
    private final RetrivalErrorCode retrivalErrorCode;
    private final Object[] args;
    private Object data;

    public RetrievalException(RetrivalErrorCode assetErrorCode, Object... args) {
        this.retrivalErrorCode = assetErrorCode;
        this.args = args;
    }

    public RetrievalException setData(Object data) {
        this.data = data;
        return this;
    }
}
