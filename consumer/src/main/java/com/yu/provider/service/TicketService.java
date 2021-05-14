package com.yu.provider.service;

/**
 * 本来正常步骤是需要将服务提供者的接口打包，然后用pom文件导入，
 * 我们这里使用简单的方式，直接将服务的接口拿过来，路径必须保证正确，即和服务提供者相同；
 */
public interface TicketService {

    String sale();

}
