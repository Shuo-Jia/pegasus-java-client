// Copyright (c) 2017, Xiaomi, Inc.  All rights reserved.
// This source code is licensed under the Apache License Version 2.0, which
// can be found in the LICENSE file in the root directory of this source tree.
package com.xiaomi.infra.pegasus.operator;

import com.xiaomi.infra.pegasus.apps.rrdb;
import com.xiaomi.infra.pegasus.apps.update_request;
import com.xiaomi.infra.pegasus.apps.update_response;
import com.xiaomi.infra.pegasus.thrift.TException;
import com.xiaomi.infra.pegasus.thrift.protocol.TMessage;
import com.xiaomi.infra.pegasus.thrift.protocol.TMessageType;
import com.xiaomi.infra.pegasus.thrift.protocol.TProtocol;

public class rrdb_put_operator extends client_operator {
  public rrdb_put_operator(
      com.xiaomi.infra.pegasus.base.gpid gpid,
      String tableName,
      update_request request,
      long partitionHash) {
    super(gpid, tableName, partitionHash);
    this.request = request;
  }

  public String name() {
    return "put";
  }

  public void send_data(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot, int seqid)
      throws TException {
    TMessage msg = new TMessage("RPC_RRDB_RRDB_PUT", TMessageType.CALL, seqid);
    oprot.writeMessageBegin(msg);
    rrdb.put_args put_args = new rrdb.put_args(request);
    put_args.write(oprot);
    oprot.writeMessageEnd();
  }

  public void recv_data(TProtocol iprot) throws TException {
    rrdb.put_result result = new rrdb.put_result();
    result.read(iprot);
    if (result.isSetSuccess()) resp = result.success;
    else
      throw new com.xiaomi.infra.pegasus.thrift.TApplicationException(
          com.xiaomi.infra.pegasus.thrift.TApplicationException.MISSING_RESULT,
          "put failed: unknown result");
  }

  public update_response get_response() {
    return resp;
  }

  private update_request request;
  private update_response resp;
}
