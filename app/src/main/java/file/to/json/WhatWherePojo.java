package file.to.json;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"FromWhere",
"ToWhere"
})
@Generated("jsonschema2pojo")
public class WhatWherePojo {

@JsonProperty("FromWhere")
private String fromWhere;

@JsonProperty("ToWhere")
private String toWhere;






@JsonProperty("FromWhere")
public String getFromWhere() {
return fromWhere;
}

@JsonProperty("FromWhere")
public void setFromWhere(String fromWhere) {
this.fromWhere = fromWhere;
}

@JsonProperty("ToWhere")
public String getToWhere() {
return toWhere;
}

@JsonProperty("ToWhere")
public void setToWhere(String toWhere) {
this.toWhere = toWhere;
}


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(WhatWherePojo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("fromWhere");
sb.append('=');
sb.append(((this.fromWhere == null)?"<null>":this.fromWhere));
sb.append(',');
sb.append("toWhere");
sb.append('=');
sb.append(((this.toWhere == null)?"<null>":this.toWhere));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

@Override
public int hashCode() {
int result = 1;
result = ((result* 31)+((this.toWhere == null)? 0 :this.toWhere.hashCode()));

result = ((result* 31)+((this.fromWhere == null)? 0 :this.fromWhere.hashCode()));
return result;
}


}